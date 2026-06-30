class MedianOfSortedArray(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merged = nums1 + nums2
        merged.sort()

        length = len(merged)

        if length % 2 == 0:
             m = length // 2
             return (merged[m - 1] + merged[m]) / 2.0
        else:
             return merged[length // 2]