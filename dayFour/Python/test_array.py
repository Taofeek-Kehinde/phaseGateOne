import unittest
from array import listNumber
class TestListNumber(unittest.TestCase):

    def test_that_the_first_result_is_true(self):
        result = listNumber([8, 6, 12, 4, -2], 6)
        self.assertEqual(result, [8, -2])

    def test_that_the_second_result_is_true(self):
        result = listNumber([1, 2, 5, 7, 6, 8, 9], 12)
        self.assertEqual(result, [5, 7])

