/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = (nums, target) => {
    const hashMap = new Map()
    let arr = []

    for (let i = 0; i < nums.length; i++) {
        hashMap.set(i, nums[i])
    }

    for (const [key, value] of hashMap) {
        const complement = target - value

        for (const [k, v] of hashMap) {
            if (v === complement && k != key) {
                arr.push(key)
                arr.push(k)
                return arr
            }
        }
    }
}