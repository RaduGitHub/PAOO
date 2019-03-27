package forma_geometrica;

public class patrat implements forma {
	
	punct m_p1, m_p2, m_p3, m_p4;
	Double distanta = null;
	
	public patrat(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3, Double x4, Double y4)
	{
		m_p1 = new punct(x1, y1);
		m_p2 = new punct(x2, y2);
		m_p3 = new punct(x3, y3);
		m_p4 = new punct(x4, y4);
		distanta = Math.sqrt( (m_p1.x-m_p2.x)*(m_p1.x-m_p2.x) + (m_p2.y-m_p1.y)*(m_p2.y-m_p1.y) );
	}
	
	public double arie()
	{
		//distanta = Math.sqrt( (m_x2-m_x1)*(m_x2-m_x1) + (m_y2-m_y1)*(m_y2-m_y1) );
		//System.out.println(distanta);
		return distanta*distanta;
	}
	public double perimetru()
	{
		return 4*distanta;
		//return m_x1;
		
	}

}
