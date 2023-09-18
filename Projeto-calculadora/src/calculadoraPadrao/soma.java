package calculadoraPadrao;

	class soma extends calculadoraBase {
	    @Override
	    public double calcular(double a, double b) {
	        return a + b;
	    }
	    @Override
	    String getVisualizar() {
	        return "soma";
	}
	}

