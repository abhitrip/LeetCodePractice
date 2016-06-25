class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        num_and_pos = {}
        for idx,number in enumerate(nums):
            second_number = target-number
            if target-number in num_and_pos:# and not num_and_pos[second_number] == idx :
                arr = [num_and_pos[second_number],idx]
                return arr
            num_and_pos[number] = idx
        return [-1,-1]
        