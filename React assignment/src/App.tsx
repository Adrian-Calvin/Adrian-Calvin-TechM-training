import React, { useState } from 'react';
import MovieList from './MovieList';
import BookingList from './BookingList';
import { Movie } from './MovieList';


const App: React.FC = () => {
  const [bookedMovies, setBookedMovies] = useState<Movie[]>([]);

  const handleBook = (movie: Movie) => {
    if (!bookedMovies.some(m => m.id === movie.id)) {
      setBookedMovies([...bookedMovies, movie]);
    }
  };

  const handleRemove = (id: number) => {
    setBookedMovies(bookedMovies.filter(movie => movie.id !== id));
  };

  return (
    <div>
      <MovieList onBook={handleBook} />
      <BookingList bookedMovies={bookedMovies} onRemove={handleRemove} />
    </div>
  );
};

export default App;

