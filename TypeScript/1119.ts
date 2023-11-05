// Problem: https://leetcode.com/problems/remove-vowels-from-a-string/

function removeVowels(s: string): string {
  const set = new Set(['a', 'e', 'i', 'o', 'u']);
  const arr: string[] = [];
  for(let i = 0; i < s.length; i++) {
      if(!set.has(s[i])) arr.push(s[i])
  }
  return arr.join('')
};
