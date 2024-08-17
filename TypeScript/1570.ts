// https://leetcode.com/problems/dot-product-of-two-sparse-vectors/description/

class SparseVector {
  nums: number[];
  constructor(nums: number[]) {
  this.nums = nums;
  }

// Return the dotProduct of two sparse vectors
  dotProduct(vec: SparseVector): number {
  let prod = 0;
      for(let i = 0; i < this.nums.length; i++) {
          prod += this.nums[i] * vec.nums[i];
      }
      return prod;
  }
}

/**
* Your SparseVector object will be instantiated and called as such:
* var v1 = new SparseVector(nums1)
* var v2 = new SparseVector(nums1)
* var ans = v1.dotProduct(v2)
*/
