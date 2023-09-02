import { useParams } from "react-router-dom";
import { useState } from "react";
import axios from "axios";
// import SpeechRecognition>,{ useSpeechRecognition } from 'react-speech-recognition';

type Track = {
    track: string;
};

interface InterviewState {
    questionIndex: number;
    inputValue: string;
    finalData: { [key: string]: string };
}

const ques: string =
    "1. Can you explain the concept of object-oriented programming and how it is implemented in Java?\n2. How do you handle exceptions in Java? Can you provide an example of a situation where you would use checked and unchecked exceptions?\n3. Can you explain the difference between an abstract class and an interface in Java? When would you use each?\n4. How would you design a system for a large-scale e-commerce website using Java? What technologies and frameworks would you use?\n5. Can you explain the concept of multithreading in Java? How would you handle synchronization and concurrency issues?\n6. What are some best practices for writing clean and efficient code in Java? Can you provide an example of a code optimization you have implemented?";

const Interview = () => {
    const { track } = useParams<Track>();
    const [state, setState] = useState<InterviewState>({
    questionIndex: 0,
    inputValue: "",
    finalData: {},
    });
    const [question,setQuestion]=useState<string>("")
    const [feedback,setFeedback]=useState<boolean>(false)
    const [provideFeedback,setProvideFeedback]=useState<string>("")
    // console.log(track)
    
    const getQues=()=>{
        axios.get<string>(`http://localhost:8080/mind/${track}`)
        .then(res=>{
            const response:string =res.data
            console.log(response)
            setQuestion(response)
        })
        .catch((err:Error)=>{
            console.log(err)
        })
    }
    const questionsArray: string[] = ques.split("\n");
    // const questionsArray: string[] = question.split("\n");

    // useState(()=>{
    //     getQues()
    // },[])

    const handleChange = (e: React.ChangeEvent<HTMLTextAreaElement>) => {
    setState({ ...state, inputValue: e.target.value });
    };

    const handleSubmit = (a:React.MouseEvent<HTMLButtonElement>) => {
        a.preventDefault()
        const currentQuestion = questionsArray[state.questionIndex];
        const currentAnswer = state.inputValue;
    
        // Update the finalData with the current answer
        const updatedFinalData = {
            ...state.finalData,
            [currentQuestion]: currentAnswer,
        };
        if (state.questionIndex == questionsArray.length-1) {
            console.log("All questions and answers:", updatedFinalData); // Log updatedFinalData
            axios.post("apiur",updatedFinalData)
            .then(res=>{
                setFeedback(true)
                setProvideFeedback(res.data)
            })
            .catch((err :Error)=>{
                console.log(err)
            })
        } else {
            setState({
                ...state,
                questionIndex: state.questionIndex + 1,
                inputValue: "",
                finalData: updatedFinalData, // Update finalData here
            });
        }
    };

    const {questionIndex,inputValue}=state
    return (
        <div className="max-w-[80%] md:mt-[-96px] sm:mt-[-60px] w-full h-[83vh] mx-auto text-center flex flex-col justify-center">
            {feedback ? (
                // Render the feedback when feedback is true
                <div className="bg-[#849fd2] text-start p-6 w-[90%] md:w-[70%] mx-auto rounded-xl shadow-md space-x-4">
                    <h2 className="text-white text-sm font-bold md:text-lg">
                        Feedback
                    </h2>
                    <div className="text-white">{provideFeedback}</div>
                </div>
            ) : (
                // Render the input fields when feedback is false
                <div className="bg-[#849fd2] text-start p-6 w-[90%] md:w-[70%] mx-auto rounded-xl shadow-md space-x-4">
                    <h2 className="text-white text-sm font-bold md:text-lg">
                        Question {questionsArray[questionIndex]}
                    </h2>
                    <div className="flex items-center">
                        <textarea
                            className="rounded-lg py-4 w-[90%] h-32 px-3 mt-4 mr-2 text-start"
                            value={inputValue}
                            onChange={handleChange}
                            placeholder="Enter Your Answer here..."
                        />
                        <button
                            className="bg-[#1baaf7] w-[50px] text-white rounded-md font-medium my-6 mx-auto py-3 hover:bg-[#28d5d2]"
                            disabled={inputValue.length===0}
                            onClick={handleSubmit}
                        >
                            Send
                        </button>
                    </div>
                </div>
            )}
        </div>
    )
};

export default Interview;

