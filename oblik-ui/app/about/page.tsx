"use client"

import {useState} from "react";

type Data = {
  id: number;
  name: string;
}


export default function About() {
  let [data, setData] = useState<Data[]>([])


  const handleButtonClick = async () => {
    //TODO: @su1gen we should use env variable instead of hardcode
    const response = await fetch(`http://localhost:8080/api/data`)
    const responseJson = await response.json()

    console.log(process.env.NEXT_PUBLIC_API_URL)

    setData((prevState) => {
      return [...prevState, responseJson]
    })
  }


  return (
    <>
      <button onClick={handleButtonClick}>Click</button>
      <p> About hello world</p>

      {data.length !== 0 && data.map((item, i) => {
        return <div key={i}>
          <p>Id: {item.id}</p>
          <p>Name: {item.name}</p>
        </div>
      })}

      {/*{data && <div>*/}
      {/*  <p>Id: {data.id}</p>*/}
      {/*  <p>Name: {data.name}</p>*/}
      {/*</div>}*/}
    </>
  );
}
