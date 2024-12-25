# Infinity War Project

## Overview
The **Infinity War Project** is a graph-based computational problem-solving application inspired by Marvel’s *Avengers: Infinity War*. The project aims to simulate various scenarios related to the film’s narrative by employing data structures such as graphs, adjacency matrices, and algorithms like Dijkstra's. Each task involves distinct challenges that enhance understanding of graph theory and problem-solving in Java.

This repository contains Java implementations for solving these challenges, using real-world graph-based analogies from the storyline.

---

## Features

### Task Implementations

### 1. ForgeStormBreaker
- **Purpose**: Calculates the total flux endured by Thor using a 2D array.
- **Input**: A matrix of integers representing flux intensity.
- **Output**: Sum of all matrix values.
- **Usage**: Demonstrates matrix operations and file handling.

### 2. LocateTitan
- **Purpose**: Determines the minimum energy cost of traveling from Earth to Titan through a wormhole network represented as a weighted undirected graph.
- **Steps**:
  - Construct an adjacency matrix based on input values.
  - Adjust edge weights using generator functionality.
  - Use Dijkstra's algorithm to find the shortest path.
- **Output**: Minimum cost to reach Titan.
- **Usage**: Applies graph algorithms and weighted adjacency matrices.

### 3. MindStoneNeighborNeurons
- **Purpose**: Identifies all neurons directly connected to the Mind Stone in Vision’s neural network.
- **Input**: Directed graph represented as a set of edges.
- **Output**: Names of all neurons connected to the Mind Stone.
- **Usage**: Highlights directed graph traversal and neighbor identification.

### 4. UseTimeStone
- **Purpose**: Analyzes timelines in a directed graph of events, identifying:
  1. Total number of timelines.
  2. Number of timelines with a cumulative expected utility (EU) above a threshold.
- **Input**: Adjacency matrix of events and a threshold EU value.
- **Output**: Two numbers: total timelines and qualifying timelines.
- **Usage**: Emphasizes pathfinding and conditional computation.

### 5. PredictThanosSnap
- **Purpose**: Simulates Thanos’ snap by randomly removing vertices from a social network graph and checks if the remaining graph is connected.
- **Steps**:
  - Use a seeded random function to remove vertices.
  - Check graph connectivity post-removal.
- **Output**: Boolean value indicating if the graph remains connected.
- **Usage**: Explores randomization and connectivity checks in graphs.

---

## Implementation Notes
1. **Code Structure**:
   - All files are located in the `src/avengers/` directory.
   - Predefined files like `StdIn.java`, `StdOut.java`, and `StdRandom.java` are used for input/output operations and randomization.
   - Each task has its own Java class with no static variables.

2. **Graph Representation**:
   - Used adjacency matrices and set-of-edges representation for different tasks.
   - Incorporated weights and functionality adjustments for real-world relevance.

3. **Algorithms**:
   - Dijkstra's algorithm for shortest path computation.
   - Graph traversal techniques for neighbor and connectivity checks.

---

## What I Learned
This project provided an opportunity to deepen my understanding of:

1. **Graph Theory**:
   - Constructing and manipulating adjacency matrices.
   - Understanding directed and undirected graphs.
   - Applying graph algorithms like Dijkstra’s for real-world problems.

2. **Algorithm Implementation**:
   - Using Java to implement efficient graph-based solutions.
   - Incorporating randomness and ensuring reproducibility through seeds.

3. **Problem-Solving Skills**:
   - Breaking down complex problems into smaller, manageable components.
   - Translating abstract scenarios into computational tasks.

4. **File Handling in Java**:
   - Reading from and writing to files using `StdIn` and `StdOut`.
   - Managing input/output for automated testing.

5. **Code Design**:
   - Structuring code for readability and modularity.
   - Avoiding redundancy and adhering to project guidelines.

---

## How to Run
1. **Setup**:
   - Ensure Java is installed on your system.
   - Clone this repository and navigate to the `InfinityWar` directory.

2. **Compile**:
   ```bash
   javac -d bin src/avengers/*.java
3. **Run**:
   ```bash
   # Replace `ClassName` with the desired class (e.g., `ForgeStormBreaker`):
   java -cp bin avengers.ClassName inputFileName outputFileName

   # Example:
   java -cp bin avengers.ForgeStormBreaker forgestormbreaker.in forgestormbreaker.out
---

## Conclusion
The Infinity War Project was a highly engaging way to explore graph theory and algorithmic problem-solving. By simulating scenarios from Avengers: Infinity War, I gained valuable insights into computational thinking and Java programming.
