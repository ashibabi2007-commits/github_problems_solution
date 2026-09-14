class Solution:
    def majorityElement(self, nums):
        n=len(nums)
        count={}
        for num in nums:
            count[num]=count.get(num,0)+1
        result=[]
        for num in count:
            if count[num]>n//3:
                result.append(num)
        return result