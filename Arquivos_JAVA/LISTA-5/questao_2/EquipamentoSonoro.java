package questao_2;

public class EquipamentoSonoro extends Equipamento {
	private short volume;
	private boolean stereo;
	
	public EquipamentoSonoro() {
		super();
		this.volume = 5;
		this.stereo = false;
	}
	
	public short getVolume() {
		return volume;
	}
	public void setVolume(short volume) {
		if (volume >= 0 && volume <= 10) {
			this.volume = volume;
		} else {
			System.out.println("O volume não pode ser menor do 0 ou maior do que 10.");
		}
	}
	
	public void aumentaVolume() {
        if (volume < 10) {
            volume++;
        } else {
            System.out.println("Erro: Volume máximo atingido.");
        }
    }

    public void diminuiVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Erro: Volume mínimo atingido.");
        }
    }
	
	public void mono() {
		this.stereo = false;
	}
	public void stereo() {
		this.stereo = true;
	}
	
	@Override
	public void liga() {
		super.liga();
		volume = 5;
	}
}
