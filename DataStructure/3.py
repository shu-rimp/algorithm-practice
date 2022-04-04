#leetcode Find Pivot Index

class Solution:
    def pivotIndex(self, nums: List[int]) -> int:    # leetcode제출창에서 고정된 라인
        
        result = 0

        for i in range(len(nums)) :
            if sum(nums[0 : i]) == sum(nums[i+1:len(nums)]) :
                result = i
                break
            else :
                result = -1

        return result