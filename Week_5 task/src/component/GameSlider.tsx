import { useState } from "react";
import {
  Box,
  Slider,
  SliderTrack,
  SliderFilledTrack,
  SliderThumb,
  SliderMark,
  Text,
} from "@chakra-ui/react";

const GameSlider = ({ onChange }: { onChange: (value: number) => void }) => {
  const [rating, setRating] = useState(3);

  const handleSliderChange = (value: number) => {
    setRating(value);
    onChange(value); 
  };

  return (
    <Box p={4} w="300px">
      <Text fontSize="lg" mb={2}>
        Filter by Rating: {rating}+
      </Text>

      <Slider
        aria-label="game-rating-slider"
        min={1}
        max={5}
        step={0.5}
        value={rating}
        onChange={handleSliderChange}
      >
        <SliderTrack bg="gray.200">
          <SliderFilledTrack bg="blue.500" />
        </SliderTrack>
        <SliderThumb boxSize={6} />

        {[1, 2, 3, 4, 5].map((num) => (
          <SliderMark key={num} value={num} mt="1" ml="-2.5" fontSize="sm">
            {num}
          </SliderMark>
        ))}
      </Slider>
    </Box>
  );
};

export default GameSlider;
