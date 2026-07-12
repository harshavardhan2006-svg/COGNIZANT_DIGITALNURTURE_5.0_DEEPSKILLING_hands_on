import { CalculateScore } from "./Components/CalculateScore";

function App() {

    return (

        <div>

            <CalculateScore
                Name={"Steve"}
                School={"MineCraft Public School"}
                total={269}
                goal={300}
            />

        </div>

    );
}

export default App;