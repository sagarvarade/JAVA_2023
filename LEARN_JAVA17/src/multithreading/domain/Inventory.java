package multithreading.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Inventory {
    private int count;

	public Inventory() {
		super();
	}

	public Inventory(int count) {
		super();
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public Inventory setCount(int count) {
		this.count = count;
		return this;
	}

    
}
