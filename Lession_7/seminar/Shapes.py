from abc import ABC, abstractmethod
from math import pi
from typing import List

class Shape(ABC):
    @abstractmethod
    def get_area(self):
        pass

class SquareShape(Shape):
    def __init__(self,side):
        self.side = side

    def get_area(self):
        print('Площадь квадрата, со стороной: ',self.side, ' = ')
        return self.side * self.side

class CircleShape(Shape):
    def __init__(self,radius):
        self.radius = radius
    
    def get_area(self):
        print('Диаметр круга, с радиусом: ', self.radius, ' = ')
        return pi * self.radius * self.radius
    
shapes: List[Shape] = [SquareShape(2), CircleShape(4)]
# shapes =  [SquareShape(2), CircleShape(4)]

for shape in shapes:
    print(shape.get_area())

