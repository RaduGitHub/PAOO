package forma_geometrica;

public class cerc implements forma{
	
	Double m_raza = null;
	punct m_p1;
	
	public cerc(Double x, Double y, Double raza)
	{
		m_p1 = new punct(x,y);
		m_raza = raza;
	}
	//->Double = double

	public double arie()
	{
		return ( Math.PI * m_raza * m_raza ) / 4;
	}
	
	public double perimetru()
	{
		return 0;
	}
}
