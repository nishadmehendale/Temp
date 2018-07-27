//Compex class which performs addition and returns third object 
public class Complex {
	private float real;
	private float imaginary;
	public Complex(){
		
	}
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImaginary() {
		return imaginary;
	}
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	public Complex addComplex(Complex Complex1,Complex Complex2) {
		Complex complexSum = new Complex();
		complexSum.real = Complex1.getReal() + Complex2.getReal();
		complexSum.imaginary = Complex1.getImaginary() + Complex2.getImaginary();
		return complexSum;
	}
	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
	
}
