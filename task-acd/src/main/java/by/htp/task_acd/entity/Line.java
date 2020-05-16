package by.htp.task_acd.entity;

public class Line {

	private String firstColumn;
	private String secondColumn;

	public Line() {
	}

	public Line(String firstColumn, String secondColumn) {
		super();
		this.firstColumn = firstColumn;
		this.secondColumn = secondColumn;
	}

	public String getFirstColumn() {
		return firstColumn;
	}

	public void setFirstColumn(String firstColumn) {
		this.firstColumn = firstColumn;
	}

	public String getSecondColumn() {
		return secondColumn;
	}

	public void setSecondColumn(String secondColumn) {
		this.secondColumn = secondColumn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstColumn == null) ? 0 : firstColumn.hashCode());
		result = prime * result + ((secondColumn == null) ? 0 : secondColumn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (firstColumn == null) {
			if (other.firstColumn != null)
				return false;
		} else if (!firstColumn.equals(other.firstColumn))
			return false;
		if (secondColumn == null) {
			if (other.secondColumn != null)
				return false;
		} else if (!secondColumn.equals(other.secondColumn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Line [firstColumn=" + firstColumn + ", secondColumn=" + secondColumn + "]";
	}
}
