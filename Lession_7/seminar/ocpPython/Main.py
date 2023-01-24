from typing import List
from Shape import *

shapes : List[Shape] = [SquareNewColorShape('$'), SquareShape(),TriagleShape(),CircleShape()]


for shape in shapes:
    shape.drow()
