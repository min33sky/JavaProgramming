package practice.textInputOutput;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.omg.CORBA.TRANSACTION_MODE;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * XML 파일 읽기
 * @author Heo-MH
 *
 */
public class ReadXml1 {
	public static void main(String[] args) {

		File file = new File("Sample.xml");

		// DOM 서버용 팩토리 생성 (팩토리 -> 빌더 -> 객체 생성)
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;

		try {
			docBuilder = docFactory.newDocumentBuilder();

			// XML 문서를 파싱해서 문서 객체를 생성한다.
			Document doc = docBuilder.parse(file);

			// XML파일의 요소들을 모두 읽어온다.
			Element root = doc.getDocumentElement();

			// 루트 요소의 노드명을 가져온다.
			System.out.println("노드명: " + root.getNodeName());

			// 루트 요소의 자식 노드를 가져온다.
			NodeList rootChildren = root.getChildNodes();

			System.out.println("자식 요소 수: " + rootChildren.getLength());
			System.out.println("---------------");

			for (int i = 0; i < rootChildren.getLength(); i++) {
				// 자식 노드를 추출한다.
				Node child = rootChildren.item(i);

				// 요소 노드의 경우에만
				if(child.getNodeType() == Node.ELEMENT_NODE){
					NodeList personChildren = child.getChildNodes();

					for(int j = 0; j < personChildren.getLength(); j++){
						// 뽑아낸 자식 노드에서 차례로 항목을 추출한다.
						Node personNode = personChildren.item(j);

						// 노드명 취득
						String text = personChildren.item(j).getNodeName();

						if(personNode.getNodeType() == Node.ELEMENT_NODE){

							// 노드값 취득
							String value = personChildren.item(j).getTextContent().trim();

							if(text.equals("type")){
								System.out.println("종류: " + value);
							}else if(text.equals("name")){
								System.out.println("이름: " + value);
							}else if(text.equals("locality")){
								System.out.println("원산지: " + value);
							}else if(text.equals("productname")){
								System.out.println("제품명: " + value);
							}
						}

					}
					System.out.println("--------------------");
				}
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// 문법 오류가 발생
			e.printStackTrace();
		} catch (IOException e){
			// 파일 읽기 오류가 발생
			e.printStackTrace();
		}
	}
}
