from math import sqrt


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self, other):
        return round(sqrt((self.x - other.x)**2 + (self.y - other.y)**2), 3)
