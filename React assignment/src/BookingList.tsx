import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

interface Movie {
  id: number;
  title: string;
}

interface Props {
  bookedMovies: Movie[];
  onRemove: (id: number) => void;
}

const BookingList: React.FC<Props> = ({ bookedMovies, onRemove }) => (
  <div className="container mt-4">
    <h2>My Bookings</h2>
    <ul className="list-group">
      {bookedMovies.map(movie => (
        <li key={movie.id} className="list-group-item d-flex justify-content-between align-items-center">
          {movie.title}
          <button className="btn btn-danger btn-sm" onClick={() => onRemove(movie.id)}>Remove</button>
        </li>
      ))}
    </ul>
  </div>
);

export default BookingList;
