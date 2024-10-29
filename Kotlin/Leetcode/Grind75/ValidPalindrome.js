var isPalindrome = function (s) {
    let arr = s.toLowerCase().split("")
    let result = arr.filter((char => !char.match(/[^a-zA-Z0-9]/)))

    let left = 0
    let right = result.length - 1

    if (result.length % 2 === 1) {
        while (left !== right) {
            console.log("odd-", result[left], result[right])
            if (result[left] === result[right]) {
                left++
                right--
            } else {
                return false
            }
        }
    } else {
        while (right > left) {
            console.log("even-", result[left], result[right])
            if (result[left] === result[right]) {
                left++
                right--
            } else {
                return false
            }
        }
    }        
    return true
};