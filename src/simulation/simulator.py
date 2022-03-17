"""
This is the simulator for simulation clocks, nodes, edges and their transitions.

"""
from classes import Node, Edge, Clock


class ClockSimulator:
    def __init__(self):
        self.nodes = []
        self.edges = []
        self.clocks = []

    def append_node(self, node):
        self.nodes.append(node)
    
    def append_edge(self, edge):
        self.edges.append(edge)
    
    def append_clock(self, clock):
        self.clocks.append(clock)
    
    def simulate(self):
        pass
    

class SimpleClockSimulator:
    def __init__(self):
        self.nodes = []
        self.edges = []
        self.clocks = []

    def append_node(self, node):
        self.nodes.append(node)
    
    def append_edge(self, edge):
        self.edges.append(edge)
    
    def append_clock(self, clock):
        self.clocks.append(clock)
    
    def simulate(self):
        current_state = next([x for x in self.nodes if x.is_initial_state])
        end_state = next([x for x in self.nodes if x.is_end_state])
        
        while current_state != end_state:
            pass
    
    
# https://www.moodle.aau.dk/pluginfile.php/2420959/course/section/543353/UPPAAL%20Lecture%207%20Safe.pdf
# slide 57
if __name__ == '__main__':
    sim = SimpleClockSimulator()
    sim.append_clock(Clock('y', Value=0))
    sim.append_clock(Clock('x', Value=0))
    sim.append_node(Node('L0', is_init=True))
    sim.append_node(Node('L1', is_end=True))
    sim.append_edge(Edge(('L0','L0'), conditions=[('y','<=',2)], effects=[('y','=',0)]))
    sim.append_edge(Edge(('L0','L0'), conditions=[('x','<=',2)], effects=[('x','=',0)]))
    sim.append_edge(Edge(('L0','L1'), conditions=[('y','<=',2), ('x','>=',4])))
    print(sim.simulate())