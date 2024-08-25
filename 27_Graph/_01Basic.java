/*
  Graph
  representation = 1.Adjacency List. 2.Adjacency Matrix.  3.Edge List. 4.Implicit graph
  1.Adjacency List = (Array of Array list) O(E) {E - edges}
    ex =    0     2
             \   / \
              \ /   \
               1- - - 3
            
            0 = [1]
            1 = [0,2,3]
            2 = [1,3]
            4 = [1,2].     Array of Array list <Edge>
                                                 |
                                                (s , d, w)
            
    2. Adjacency Matrix => O(V)
    3. Edge List = {{0,1}, {1,2}, {1,3} , {2,3}}
    4. Implicit graph => (give the pathe of source to destination)
 */