package main;

import main.ast.node.Program;
import main.compileError.CompileError;
import main.visitor.astPrinter.ASTPrinter;
import main.visitor.codeGenerator.CodeGenerator;
import main.visitor.nameAnalyzer.NameAnalyzer;
import main.visitor.typeAnalyzer.TypeAnalyzer;
import org.antlr.v4.runtime.*;
import parsers.*;

import java.io.FileWriter;
import java.io.IOException;

public class UTL {
    public static void main(String[] args) throws IOException {
        CharStream reader = CharStreams.fromFileName(args[0]);
        UTLLexer lexer = new UTLLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UTLParser parser = new UTLParser(tokens);
        Program program = parser.program().pro;
        NameAnalyzer nameAnalyzer = new NameAnalyzer();
        nameAnalyzer.visit(program);
        TypeAnalyzer typeAnalyzer = new TypeAnalyzer();
        typeAnalyzer.visit(program);
        if (!typeAnalyzer.typeErrors.isEmpty()) {
            for (CompileError compileError : typeAnalyzer.typeErrors)
                System.out.println(compileError.getMessage());
        }
        CodeGenerator codeGen = new CodeGenerator(program);
        String result = codeGen.generate().toString();

        String output = (args.length > 1) ? args[1] : "out.j";
        if (writeToFile(output, result)) {
            System.out.println("Compilation was Successful!!");
        }
    }

        private static boolean writeToFile(String name, String text) {
            try {
                FileWriter file = new FileWriter(name, false);
                file.write(text);
                file.close();
                return true;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            return false;
        }
    }



