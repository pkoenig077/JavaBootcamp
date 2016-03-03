
public class Door {
	private boolean keyType;
	private DoorPos position;
	private Colors colors;
	/**
	 * @return the keyType
	 */
	public boolean isKeyType() {
		return keyType;
	}
	/**
	 * @param keyType the keyType to set
	 */
	public void setKeyType(boolean keyType) {
		this.keyType = keyType;
	}
	/**
	 * @return the color
	 */
	public Colors getColor() {
		return colors;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Colors color) {
		this.colors = color;
	}
	/**
	 * @return the position
	 */
	public DoorPos getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(DoorPos position) {
		this.position = position;
	}
}
