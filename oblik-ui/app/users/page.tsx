type Data = {
  id: number;
  name: string;
}


export default async function Users() {
  const response = await fetch(`http://localhost:8080/api/data`)
  const responseJson: Data = await response.json()

  return (
    <>
      <p> Users hello world</p>

      <div>
        <p>Id: {responseJson.id}</p>
        <p>Name: {responseJson.name}</p>
      </div>


      {/*{data.length !== 0 && data.map((item, i) => {*/}
      {/*  return <div key={i}>*/}
      {/*    <p>Id: {item.id}</p>*/}
      {/*    <p>Name: {item.name}</p>*/}
      {/*  </div>*/}
      {/*})}*/}

      {/*{data && <div>*/}
      {/*  <p>Id: {data.id}</p>*/}
      {/*  <p>Name: {data.name}</p>*/}
      {/*</div>}*/}
    </>
  );
}
