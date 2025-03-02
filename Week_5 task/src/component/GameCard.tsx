import { Box, Image, Text } from "@chakra-ui/react";

const GameCard = ({ title, image }: { title: string; image: string }) => {
  return (
    <Box
      w="140px"
      h="200px"
      borderRadius="12px"
      overflow="hidden"
      boxShadow="md"
      textAlign="center"
      bg="gray.800"
      color="white"
      p={2}
    >
      <Image src={image} alt={title} w="100%" h="120px" objectFit="cover" />
      <Text fontSize="xs" mt={2} noOfLines={2} whiteSpace="normal">
        {title}
      </Text>
    </Box>
  );
};

export default GameCard;
