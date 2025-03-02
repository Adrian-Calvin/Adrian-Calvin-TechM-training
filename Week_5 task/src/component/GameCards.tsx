import { Box, Flex } from "@chakra-ui/react";
import GameCard from "./GameCard";

const GameCards = ({ games }: { games: any[] }) => {
  return (
    <Box p={4} w="100%">
      <Flex 
        wrap="wrap" 
        gap={4} 
        justify="center"
      >
        {games.map((game) => (
          <GameCard key={game.id} title={game.name} image={game.background_image} />
        ))}
      </Flex>
    </Box>
  );
};

export default GameCards;
