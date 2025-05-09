package generic_002_yes;

public class Product<T, M> {
	private T kind;//20
	private M model;//tv자료형
	
	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}

