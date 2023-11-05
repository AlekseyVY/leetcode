function findChampion(n, edges) {
  if(edges.length === 0 && n === 1) return 0
  if(edges.length === 0 || edges.length !== n) return -1
  const teams = new Array(n).fill(0);
  for(let i = 0; i < edges.length; i++) {
      for(let j = 0; j < edges[i].length - 1; j++) {
          teams[edges[i][j]]++;
          teams[edges[i][j + 1]]--;
      }
  }
  console.log(teams)
  let count = 0;
  let idx = 0;
  console.log(count)
  for(let i = 0; i < teams.length; i++) {
      if(teams[i] >= 1) {
          count++;
          idx = i;
      }
  }
  return count === 1 ? idx : -1
};


console.log(findChampion(1, []))
