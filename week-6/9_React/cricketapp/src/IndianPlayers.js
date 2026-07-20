import React from "react";

// Odd Players
export function OddPlayers({ team }) {
  const [first, , third, , fifth] = team;

  return (
    <div>
      <li>First : {first}</li>
      <li>Third : {third}</li>
      <li>Fifth : {fifth}</li>
    </div>
  );
}

// Even Players
export function EvenPlayers({ team }) {
  const [, second, , fourth, , sixth] = team;

  return (
    <div>
      <li>Second : {second}</li>
      <li>Fourth : {fourth}</li>
      <li>Sixth : {sixth}</li>
    </div>
  );
}

// Merge Arrays
const T20Players = [
  "First Player",
  "Second Player",
  "Third Player",
];

const RanjiPlayers = [
  "Fourth Player",
  "Fifth Player",
  "Sixth Player",
];

export const IndianPlayers = [
  ...T20Players,
  ...RanjiPlayers,
];

// Display merged players
export function ListofIndianPlayers({ IndianPlayers }) {
  return (
    <div>
      {IndianPlayers.map((player, index) => (
        <li key={index}>Mr. {player}</li>
      ))}
    </div>
  );
}