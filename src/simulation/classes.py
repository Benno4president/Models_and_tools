

class Node:
    def __init__(self, name, conditions=[], is_init=False, is_end=False):
        self.name = name
        self.conditions = conditions
        self.is_initial_state: bool = is_init
        self.is_end_state: bool = is_end
        
    
class Edge:
    def __init__(self, nodes, conditions=[], effects=[]):
        self.nodes: tuple(str,str) = nodes
        self.conditions = conditions
        self.effects = effects
    

class Clock:
    def __init__(self, name, value):
        self.name = name
        self.value = value
