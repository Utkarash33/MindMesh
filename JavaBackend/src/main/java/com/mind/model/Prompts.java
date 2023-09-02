package com.mind.model;
import org.springframework.stereotype.Component;

@Component
public class Prompts {

    public String getPrompt(String role) {
        switch (role) {
            case "JAVA":
                return "Imagine you are conducting an interview for a java developer position at a leading tech company.As the interviewer,"
                		+ " your goal is to assess the candidate's technical expertise,"
                		+ " problem-solving skills,and alignment with the role of java backend developer it is a tech interview round."
                		+ "Please take a set of five questions will be displayed—insightful and open-ended questions that you would ask the candidate during the interview.\n" +
                        "Your questions should cover topics such as coding practices, system design, and relevant technologies.\n" +
                        "Format the questions as a list in JavaScript-friendly string format, with each question separated by \"\\n\".\n" +
                        "Your thoughtful questions will help ensure a comprehensive evaluation of the candidate's qualifications for the java developer role.\n" +
                        "Output format\n" +
                        "\"first question\"\n" +
                        "\"second question\"\n" +
                        "\"third question\"\n" +
                        "and so on.... with numbering";
            case "MERN":
                return "Imagine you are conducting an interview for a mern stack developer position at a leading tech company."
                		+ "As the interviewer, your goal is to assess the candidate's technical expertise, problem-solving skills,"
                		+ "and alignment with the role of mern stack developer it is a tech interview round."
                		+ "Please take a set of five questions these 5 will be displayed—insightful and open-ended questions that you would ask the candidate during the interview.\n" +
                        "Your questions should cover topics such as coding practices, system design, and relevant technologies.\n" +
                        "Format the questions as a list in JavaScript-friendly string format, with each question separated by \"\\n\".\n" +
                        "Your thoughtful questions will help ensure a comprehensive evaluation of the candidate's qualifications for the mern stack developer role.\n" +
                        "Output format\n" +
                        "\"first question\"\n" +
                        "\"second question\"\n" +
                        "\"third question\"\n" +
                        "and so on....";
            case "NODE":
                return "Imagine you are conducting an interview for a node js developer position at a leading tech company."
                		+ "As the interviewer, your goal is to assess the candidate's technical expertise, problem-solving skills,"
                		+ "and alignment with the role of node js developer it is a tech interview round."
                		+ "Please take a set of five questions these 5 will be displayed—insightful and open-ended questions that you would ask the candidate during the interview.\n" +
                        "Your questions should cover topics such as coding practices, system design, and relevant technologies.\n" +
                        "Format the questions as a list in JavaScript-friendly string format, with each question separated by \"\\n\".\n" +
                        "Your thoughtful questions will help ensure a comprehensive evaluation of the candidate's qualifications for the node js developer role.\n" +
                        "Output format\n" +
                        "\"first question\"\n" +
                        "\"second question\"\n" +
                        "\"third question\"\n" +
                        "and so on....";
            default:
                return "####The the role of an interviwer and give me feedback by conparing the answer for the each question make the scoreing as hard as possible"
                		+ "   no room for errors"
                		+ "  framework in no more than 50 words####:\r\n"
                		+ "   the framwork to compare answers with is DUBX: \r\n"
                		+ "    D - Definition (it should include the key technical terms) \r\n"
                		+ "    U - Use Cases \r\n"
                		+ "    B - Benefits \r\n"
                		+ "    X - Extra Information \r\n"
                		+ "    #### An example to explain the concept by using DUBX \"Objects\" in javascript: \r\n"
                		+ "    Definition: Object is a data type that stores data in the form of key-value pairs. It also allows actions to be performed on this data using methods. \r\n"
                		+ "    Use Cases: It is used whenever you have unordered data which has to be fetched using a property name. \r\n"
                		+ "    Example use cases:\r\n"
                		+ "    - Amazon_User: keys are name, age, gender, address, orders, payment_method \r\n"
                		+ "    - Product: name, price, rating, reviews, inventory \r\n"
                		+ "    Benefits: Unlike Arrays, with Objects you don't need to search information in the whole array. You can fetch the required value simply from its key. \r\n"
                		+ "    Extra Information: Objects can also capture the entity's behavior using Object methods. Example: For Product, it could be get Average Rating(), for Amazon_User it could be getOrderList() . ####\r\n"
                		+ "    ####\r\n"
                		+ "    The feedback should be evaluated using the following rubrics\r\n"
                		+ "    1.Subject Matter Expertise\r\n"
                		+ "    2.Communication skills\r\n"
                		+ "    Feedback for Subject Matter Expertise and Communication skills should contain ratings on my interview responses from 0 - 10\r\n"
                		+ "    ###\r\n"
                		+ "    Formate of the feedback:-"
                		+ "    feedbacks in the pointers\"\\n\"\r\n"
                		+ "     - lack of clearity\r\n"
                		+ "     - not understand the question clearly\r\n"
                		+ "     - trying to be more creative\r\n"
                		+ "     - poor comuntication skills\r\n"
                		+"         (and same other pointers like this as you feel for all the answes) after that "
                		+ "    subject matter like 1/10 or whatever you feel\"\\n\"\r\n"
                		+ "    communication skills like 1/10 or whatever you feel\"\\n\"\r\n "
                		+"     pointers to improve"
                		+ "     - fd clearity\r\n"
                		+ "     - not understand the question clearly\r\n"
                		+ "     - trying to be more creative\r\n"
                		+ "     - poor comuntication skills\r\n"
                		+"        add three points to improve"
                		+ "    the out must only contains these things nothing other then that one every the \"Thank you messge or the sure message\"`"; // Handle unknown roles or provide a default prompt
        }
    }
}
