package empresa;

/* Por padrão no Java uma sub-classe só pode ter 1 super-classe, isso pode ser contornado usando uma interface como
 * super-classe. As interfaces são semelhantes a classes abstratas, tudo implicitamente é abstrato em uma interface,
 * e os atributos são static, valendo para toda a classe.
 * Interfaces são o meio de campo para ligar dois sistemas, e são comumente utilizadas para padronizar as sub-classes.
 */
public interface Animal {
	public void emitirSom();
	public void dormir();
}
