import React from "react";

export function ListofPlayers({ players }) {
  return (
    <div>
      {players.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </div>
  );
}

export function ScoreBelow70({ players }) {
  const players70 = players.filter((player) => player.score <= 70);

  return (
    <div>
      {players70.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </div>
  );
}