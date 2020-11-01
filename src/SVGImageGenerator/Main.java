package SVGImageGenerator;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        writeDrawing(800, 600, "src/SVGImageGenerator/drawing.svg");
    }

    private static final Random generator = new Random();

    private static void writeDrawing(int width, int height, String filename) throws IOException, XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = factory.createXMLStreamWriter(
                Files.newOutputStream(Paths.get(filename)));
        writer.writeStartDocument();
        writer.writeDTD(("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 20000802//EN\" "
                + "\"http://www.w3.org/TR/2000/CR-SVG-20000802/DTD/svg-20000802.dtd\">"));
        writer.writeStartElement("svg");
        writer.writeDefaultNamespace("http://www.w3.org/2000/svg");
        writer.writeAttribute("width", "" + width);
        writer.writeAttribute("height", "" + height);

        final int n = 10 + generator.nextInt(20);
        for (int i = 1; i <= n; i++) {
            final int x = generator.nextInt(width);
            final int y = generator.nextInt(height);
            final int rectangleWidth = generator.nextInt(width - x);
            final int rectangleHeight = generator.nextInt(height - y);
            final int r = generator.nextInt(256);
            final int g = generator.nextInt(256);
            final int b = generator.nextInt(256);

            writer.writeEmptyElement("rect");
            writer.writeAttribute("x", "" + x);
            writer.writeAttribute("y", "" + y);
            writer.writeAttribute("width", "" + rectangleWidth);
            writer.writeAttribute("height", "" + rectangleHeight);
            writer.writeAttribute("fill", "" + String.format("#%02x%02x%02x", r, g, b));
        }
        writer.writeEndDocument();
    }
}