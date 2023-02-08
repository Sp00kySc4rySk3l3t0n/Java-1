package com.utad.inso2.tema4.internas;

public class Position {
	private Integer x;
	class RandomWalk {
		private Integer x0;
		private Double  probability;
		private Boolean success;
		RandomWalk(Integer x0){
			this(x0,0.5);
		}
		RandomWalk(Integer x0,Double probability){
			this.x0 = x0;
			this.probability = probability;
			this.walk();
		}
		
		public Integer getX0() {
			return x0;
		}
		public Double getProbability() {
			return probability;
		}
		
		public Boolean getSuccess() {
			return success;
		}
		public void walk() {
			Double randomExperiment = Math.random();
			this.success = randomExperiment <= this.probability;
			if (this.success) 
				++x0; 
			else 
				--x0;
		}
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Position() {
		this(0);
	}
	
	public Position(Integer x) {
		super();
		this.x = x;
	}
	
	public Position simulationMove (Position positionInicial,
			Integer movimientos) {
		Position  positionFork =
				new Position(positionInicial.x);
		RandomWalk randomWalk = new RandomWalk(this.x);
		for (int i = 0; i < movimientos; i++) {
			randomWalk.walk();
		}
		positionFork.setX(randomWalk.getX0());
		return positionFork;
	}

	
	@Override
	public String toString() {
		return "Position [x=" + x + "]";
	}
	public static void main(String[] args) {
		Position position = new Position();
		System.out.println("Posicion inicial "+position);
		System.out.println("Posicion final simulado "+position.simulationMove(position, 10));
	
		
		 Position.RandomWalk randomWalk = position.new RandomWalk(10, 0.70);
		 System.out.println("Posicion final avance con 0.70 "+randomWalk.getSuccess());
		
	}
}
