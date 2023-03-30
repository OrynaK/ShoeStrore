import { useState } from "react";
import "./SearchBox.css"
function SearchBox(props) {
    const [query, setQuery] = useState("");

    const handleChange = (event) => {
        setQuery(event.target.value);
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        props.onSearch(query);
    };

    return (
        <form className="search-box" onSubmit={handleSubmit}>
            <input
                type="text"
                placeholder="Пошук"
                value={query}
                onChange={handleChange}
            />
            <button className="search-box-btn" type="submit">Пошук</button>
        </form>
    );
}

export default SearchBox;
