from abc import ABC,abstractmethod
from typing import List


class Shape(ABC):
    @abstractmethod
    def drow(self):
        pass

class SquareShape(Shape):
    def drow(self):
        print('###')
        print('###')
        print('###')
        print()

class SquareNewColorShape(Shape):
    def __init__(self,color:str):
        self.color = color 


    def drow(self):
        print(self.color * 3)
        print(self.color * 3)
        print(self.color * 3)
        print()

class CircleShape(Shape):
    def drow(self):
        print(' #')
        print('###')
        print(' #')
        print()

class TriagleShape(Shape):
    def drow(self):
        print('#')
        print('##')
        print('###')
        print()
