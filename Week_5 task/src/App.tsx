import { useState } from "react";
import GameFooter from "./component/Gamefoooter";
import GameSlider from "./component/GameSlider";
import GamePagination from "./component/GamePagination";

const App = () => {
  const [ratingFilter, setRatingFilter] = useState(3);

  return (
    <div>
      <GameSlider onChange={setRatingFilter} />
      <GamePagination minRating={ratingFilter} />
      <GameFooter />
    </div>
  );
};

export default App;
