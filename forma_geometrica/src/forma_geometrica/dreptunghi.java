package forma_geometrica;

public class dreptunghi implements forma{
	
	punct m_p1, m_p2, m_p3, m_p4;
	Double m_distanta_lungime = null;
	Double m_distanta_latime = null;
	
	public dreptunghi(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3, Double x4, Double y4)
	{
		m_p1 = new punct(x1, y1);
		m_p2 = new punct(x2, y2);
		m_p3 = new punct(x3, y3);
		m_p4 = new punct(x4, y4);
		m_distanta_lungime = Math.sqrt( (m_p1.x-m_p2.x)*(m_p1.x-m_p2.x) + (m_p2.y-m_p1.y)*(m_p2.y-m_p1.y) );
		m_distanta_latime = Math.sqrt( (m_p2.x-m_p3.x)*(m_p2.x-m_p3.x) + (m_p3.y-m_p2.y)*(m_p3.y-m_p2.y) );
	}
	
	public double arie()
	{
		return m_distanta_lungime * m_distanta_latime;
	}
	public double perimetru() 
	{
		return 2 * m_distanta_lungime * m_distanta_latime;
	}
}
