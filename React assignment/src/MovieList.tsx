import React, { useEffect, useState } from 'react';
import axios from 'axios';
import 'bootstrap/dist/css/bootstrap.min.css';

export interface Movie {
    id: number;
    title: string;
    overview: string;
    poster_path: string;
  }
  
interface Props {
  onBook: (movie: Movie) => void;
}

const MovieList: React.FC<Props> = ({ onBook }) => {
  const [movies, setMovies] = useState<Movie[]>([]);

  useEffect(() => {
    axios.get('https://api.themoviedb.org/3/movie/popular?api_key=1e0789c5576435ecb9c243a4ce25b5fa')
      .then(response => setMovies(response.data.results))
      .catch(error => console.error('Error fetching movies:', error));
  }, []);

  return (
    <div className="container mt-4">
      <h2>Popular Movies</h2>
      <div className="row">
        {movies.map(movie => (
          <div key={movie.id} className="col-md-3 mb-3">
            <div className="card">
              <img src={`https://image.tmdb.org/t/p/w500${movie.poster_path}`} className="card-img-top" alt={movie.title} />
              <div className="card-body">
                <h5 className="card-title">{movie.title}</h5>
                <button className="btn btn-primary" onClick={() => onBook(movie)}>Book Now</button>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default MovieList;