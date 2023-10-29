// Problem: https://leetcode.com/problems/asteroid-collision/description/

function asteroidCollision(asteroids: number[]): number[] {
  const stack: number[] = [];
  for(let i = 0; i < asteroids.length; i++) {
      let remain: number = asteroids[i]
      while(stack.length > 0 && remain < 0 && stack[stack.length - 1] > 0) {
          const asteroid = stack.pop()
          if((asteroid + remain) === 0) remain = 0;
          else remain = asteroid + remain > 0 ? asteroid : remain
      }
      if(remain) stack.push(remain)
  }
  return stack;
};
