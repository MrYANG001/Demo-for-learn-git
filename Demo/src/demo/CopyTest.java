package demo;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class CopyTest {

	static class Buffer {

		public Buffer(int len) {
			this.buff = new byte[len];
			this.length = len;
		}

		public Buffer(byte[] buf) {
			this.buff = buf;
			this.length = buf.length;
		}

		private byte[] buff;
		private int length;
	}

	public static void trans(List<Buffer> inputs, List<Buffer> outputs) {
		String temp = "";
		for (int i = 0; i < inputs.size(); i++) {
			temp = temp + new String(inputs.get(i).buff);
//			temp = temp + inputs.get(0).buff.toString();
		}

		int begintemp = 0;

		for (int i = 0; i < outputs.size(); i++) {
			if(begintemp+outputs.get(i).length > temp.length()) {
				while((begintemp+outputs.get(i).length - temp.length()) >0){
					temp = temp + " ";
				}
			}
			outputs.set(i, new Buffer(temp.substring(begintemp, begintemp+outputs.get(i).length).getBytes(StandardCharsets.US_ASCII)));			
			begintemp = begintemp+outputs.get(i).length;
			System.out.println(new String(outputs.get(i).buff));
		}
	}

	public static void main(String[] args) {
		List<Buffer> inputs = Arrays.asList(new Buffer("aaaaaaaaaaaaaaaa".getBytes(StandardCharsets.US_ASCII)),
				new Buffer("bbbbbb".getBytes(StandardCharsets.US_ASCII)),
				new Buffer("cc".getBytes(StandardCharsets.US_ASCII)),
				new Buffer("dddddddddddd".getBytes(StandardCharsets.US_ASCII)));

		List<Buffer> outputs = Arrays.asList(new Buffer(10), new Buffer(8), new Buffer(2), new Buffer(20));
		trans(inputs, outputs);

		
		// 期望的输出应该是

		// aaaaaaaaaa
		// aaaaaabb
		// bb
		// bbccdddddddddddd

	}

}
