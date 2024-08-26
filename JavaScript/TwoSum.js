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

// 8.26
const twoSum = (nums, target) => {
    //create new array
    const arr = []
    //create new map of nums and their indices
    const map = new Map()
    //loop through nums
    for (let i = 0; i < nums.length; i++) {
        map.set(nums[i], i)
    }
    //for each value
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i]

        if (map.has(complement) && i != map.get(complement)) {
            arr.push(i)
            arr.push(map.get(complement))
            return arr
        }
    }
}