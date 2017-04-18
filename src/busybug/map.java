package busybug;

public class map{
	public int Creature[];
	public boolean Flag[];
	public int Pieces[];
	
	public void setCreature(int c[]){
		this.Creature = new int[9];
		for(int i = 0; i < 9; i++)
		{
			Creature[i] = c[i];
		}
	}

	public void setPieces(int p[]) {
		this.Pieces = new int [9];
		for(int i = 0; i < 9; i++)
		{
			Pieces[i] = p[i];
		}
	}
	
	public void setFlag(){
		this.Flag = new boolean [9];
		for(int i = 0; i < 9; i++)
		{
			Flag[i] = true;
		}
	}
	
	public boolean[] getFlag(){
		return this.Flag;
	}


}

