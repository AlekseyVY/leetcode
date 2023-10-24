// Problem: https://leetcode.com/problems/simplify-path/

function simplifyPath(path: string): string {
  const stack: string[] = [];
  const arr = path.split('/').filter(Boolean);
  for(let i = 0; i < arr.length; i++) {
      if(arr[i] === '..') stack.pop()
      else if(arr[i] === '.') continue
      else stack.push(arr[i])
  }
  return `/${stack.join('/')}`
};
