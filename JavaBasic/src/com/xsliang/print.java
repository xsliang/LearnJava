package com.xsliang;

import java.io.File;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class print {
	private static final int wdFormatPDF = 17;// PDF 格式

	public static void wordToPDF() {

		ActiveXComponent app = null;
		Dispatch doc = null;
		try {
			app = new ActiveXComponent("Word.Application");
			app.setProperty("Visible", new Variant(false));
			Dispatch docs = app.getProperty("Documents").toDispatch();
			
			// 转换前的文件路径
			String startFile = "d:\\公司发文-黑.htm";
			// 转换后的文件路劲
			String overFile = "d:\\公司发文-黑" + ".pdf";

			doc = Dispatch.call(docs, "Open", startFile,false,true).toDispatch();
			File tofile = new File(overFile);
			if (tofile.exists()) {
				tofile.delete();
			}
			Dispatch.call(doc, "SaveAs", overFile, wdFormatPDF);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			Dispatch.call(doc, "Close", false);
			if (app != null)
				app.invoke("Quit", new Variant[] {});
		}
		// 结束后关闭进程
		ComThread.Release();
	}

	public static void main(String[] args) {
		wordToPDF();
	}
}
