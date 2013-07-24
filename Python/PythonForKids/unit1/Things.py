class Things:
    pass

# Inherit from Things
class Inanimate(Things):
    pass

# Inherit from Things
class Animate(Things):
    pass

# Inherit from Inanimate
class Sidewalks(Inanimate):
    pass

# Inherit from Animate
class Animals(Animate):

    def breath(self):
        print('breathing')
    def move(self):
        print('moving')
    def eat_food(self):
        print('eating food')

# Inherit from Animals
class Mammals(Animals):
    def feed_young_with_milk(self):
        print('feeding young')

# Inherit from Mammals
class Giraffes(Mammals):

    def __init__(self, spots):
        self.giraffe_spots = spots

    def find_food(self):
        self.move()
        print("I've found food!")
        self.eat_food()
    def eat_leaves_from_trees(self):
        self.eat_food()
    def dance_a_jig(self):
        self.move()
        self.move()
        self.move()
        self.move()


ozwald = Giraffes(100)
gertrude = Giraffes(150)
print(ozwald.giraffe_spots)
print(gertrude.giraffe_spots)