import { useState, useEffect } from "react";
import axios from "axios";
import { Button } from "@chakra-ui/react";
import GameCards from "./GameCards";

const API_KEY = "8b535ec2d34b44ff923999fea5ac22ba";

const GamePagination = ({ minRating }: { minRating: number }) => {
  const [games, setGames] = useState<any[]>([]);
  const [page, setPage] = useState(1);
  const [loading, setLoading] = useState(true);

  const fetchGames = async (pageNumber: number) => {
    setLoading(true);
    try {
      const response = await axios.get(
        `https://api.rawg.io/api/games?key=8b535ec2d34b44ff923999fea5ac22ba&page=1`
      );
      const filteredGames = response.data.results.filter(
        (game: any) => game.rating >= minRating
      );
      setGames(filteredGames);
    } catch (error) {
      console.error("Error fetching games:", error);
    }
    setLoading(false);
  };

  useEffect(() => {
    fetchGames(page);
  }, [page, minRating]);

  return (
    <div>
      {loading ? (
        <p className="text-center">Loading games...</p>
      ) : (
        <GameCards games={games} />
      )}
      <div className="flex justify-center gap-4 mt-4">
        <Button
          disabled={page === 1}
          onClick={() => setPage((prev) => prev - 1)}
        >
          Previous
        </Button>
        <Button onClick={() => setPage((prev) => prev + 1)}>Next</Button>
      </div>
    </div>
  );
};

export default GamePagination;
